package test;

import qrcode.QRCode;

public class QRCodeTest {
    public static void main(String[] args) throws Exception {
        String content = "http://liyzy.github.io.";  // 如果要扫描后跳转网址，则需要加上http
        String logoImagePath = "D:\\qrTest.png";
        String destPath = "D:\\QRCodeTest.jpg";

        QRCode.encode(content, logoImagePath, destPath, true);
        String resultStr = QRCode.decode("D:\\QRCodeTest.jpg");
        System.out.println(resultStr);
    }
}
