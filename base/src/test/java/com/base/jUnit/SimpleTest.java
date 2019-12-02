package com.base.jUnit;

import com.test;
import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-02 23:03
 */
@DisplayName("JUnit5测试类")
class SimpleTest {

    @BeforeAll
    @DisplayName("我在加载类前执行")
    static void beforeAll() {
        System.out.println("我在加载类前执行");
    }

    @BeforeEach
    @DisplayName("我在加载方法前执行")
    void beforeEach() {
        System.out.println("我在加载方法前执行");
    }

    @DisplayName("随便写一个测试方法")
    @RepeatedTest(2)
    void print() {
        test test = new test();
        System.out.println(test.print());
    }

    @Test
    @DisplayName("花里胡哨的断言🌹")
    void testAssertion() {

        assertEquals(10, 10);
        assertTrue(true);
        assertEquals(100, 100, "两个数相等");
        assertAll("数字"
                , () -> assertEquals("name", "name")
                , () -> assertEquals(500, 500));
        assertThrows(InvalidParameterException.class
                , () -> {
                    throw new InvalidParameterException();
                }
        );
        int result = assertTimeout(Duration.ofSeconds(5)
                , () -> {
                    int i = 0, j = 0;
                    while (i <= 100) {
                        for (; j <= 100000; j++)
                            j++;
                        i++;
                    }
                    return i;
                });
        assertEquals(101, result);
    }
}
