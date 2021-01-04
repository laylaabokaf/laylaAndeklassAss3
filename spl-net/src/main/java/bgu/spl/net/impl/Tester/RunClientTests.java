package bgu.spl.net.impl.Tester;
import bgu.spl.net.impl.BGRSServer.Tester.Tests;

public class RunClientTests {

        public static void main(String[] args) {
                new Thread(new Tests()).start();
        }
}