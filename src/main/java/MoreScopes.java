package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class MoreScopes {
    static {
       VALUE = 10;//line 3
    }
    public MoreScopes(int x) {
        VALUE = x;
    }
    static {
        VALUE = 30;//line 7
        { VALUE = 1;}
    }
    public static int VALUE = 15;

    public static void main(String[] args) {
        new MoreScopes(5); //line 10
        System.out.println(MoreScopes.VALUE);
    }
}
