package com.jrd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by jrd on 2016-04-07.
 */
@ConfigurationProperties(prefix = "hello", ignoreUnknownFields = false)
public class HelloProperties {

    private final TestProps testProps = new TestProps();

    public TestProps getTestProps() {
        return testProps;
    }

    public static class TestProps {
        private int test1 = 100;
        private int test2 = 100;
        private int test3 = 100;
        private String testStr = "sza!";

        public int getTest1() {
            return test1;
        }

        public void setTest1(int test1) {
            this.test1 = test1;
        }

        public int getTest2() {
            return test2;
        }

        public void setTest2(int test2) {
            this.test2 = test2;
        }

        public int getTest3() {
            return test3;
        }

        public void setTest3(int test3) {
            this.test3 = test3;
        }

        public String getTestStr() {
            return testStr;
        }

        public void setTestStr(String testStr) {
            this.testStr = testStr;
        }
    }
}
