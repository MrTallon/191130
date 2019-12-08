package com.base.jUnit;

import lombok.NonNull;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-06 11:50
 */
class LombokTest {

    @Test
    void val() {
        // 等价于：final Set<String>()
        val set = new HashSet<String>();
        set.add("123");
    }

    private static String nonnull(@NonNull String a) {
        // 参数不可为空
        return a;
    }

    @Test
    void print() {
        System.out.println(nonnull(null));
    }
}
