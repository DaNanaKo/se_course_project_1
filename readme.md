#
#### 王菁华10215101441
## Assignment1: Design Line/Branch Tests

针对Tritype.java中的函数Triang，设计JUnit测试用例，使得line coverage和branch coverage尽可能高。

<img src=".\picture\line_branch_coverage.png">

```java
package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test;


public class TritypeTest {
    @Test
    public void testTriang1() {
        // line1
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void testTriang2() {
        // line2
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 2, 3));
    }

    @Test
    public void testTriang3() {
        // line3
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 1, 2));
    }

    @Test
    public void testTriang4() {
        // line5
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
    }

    @Test
    public void testTriang5() {
        // line6
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
    }

    @Test
    public void testTriang6() {
        // line8
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(2, 2, 3));
    }

    @Test
    public void testTriang7() {
        // line 9
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(2, 2, 3));
    }

    @Test
    public void testTriang8() {
        // line11
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 4));
    }

    @Test
    public void testTriang9() {
        // line12
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 4));
    }

    @Test
    public void testTriang10() {
        //line 14
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}
```

使用这个设计样例集可以将line的覆盖率提高到48%

1新建一个TritypeLineBranchTest的测试类，在其中新建Junit测试用例，使得line coverage和branch coverage尽可能高，并确保所有Junit测试用例可运行

2提供你的Jacoco覆盖率报告的截图，放在项目的根目录下，命名为line_branch_coverage.png

好像跟上面的重了

## Assignment 2: Design Logical Coverage Tests

选择
```java
if (Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1 || Side1 + Side3 <= Side2)
```
这个decision，它有3个condition

代码就不列出来了，在目录 \app\src\test\java\com\example\tritypejunittest 中

## Assignment 3: Design Mutation-based Tests
使用(1,2,3)的测试用例可以kiil掉one

使用(2,3,3)的测试用例可以kill掉two

代码位置同上