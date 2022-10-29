
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
class jtb{
    public static String getSysClipboardText() {
        String ret = "";
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
        // 获取剪切板中的内容
        Transferable clipTf = sysClip.getContents(null);

        if (clipTf != null) {
            // 检查内容是否是文本类型
            if (clipTf.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    ret = (String) clipTf
                            .getTransferData(DataFlavor.stringFlavor);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return ret;
    }

}
class day {

    // public static void main(String[] args) {
    int i;
//}
    static void GetAnswer(String s) {
        try {
            //建立连接
            URL url = new URL("https://www.hyluz.cn/search.php?q=" + s);

            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
            httpUrlConn.setDoInput(true);
            httpUrlConn.setRequestMethod("GET");
            httpUrlConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //获取输入流
            InputStream input = httpUrlConn.getInputStream();
            //将字节输入流转换为字符输入流
            InputStreamReader read = new InputStreamReader(input, StandardCharsets.UTF_8);
            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(read);
            // 读取返回结果
            String data = br.readLine();
            while (data != null) {
                StringBuilder sb=new StringBuilder(data);
                int index1=sb.indexOf("A.");


                CharSequence str = "答案：";
                if(data.contains(str))
                {int a=0;
                    if(index1>0) {
                        sb.insert(index1 + a, '\n');
                    } int index2=sb.indexOf("B.");
                    if(index2>0) {
                        sb.insert(index2 + a, '\n');
                    }int index3=sb.indexOf("C.");
                    if(index3>0) {
                        sb.insert(index3 + a, '\n');
                    }int index4=sb.indexOf("D.");
                    if(index4>0) {
                        sb.insert(index4 + a, '\n');
                    }int index5=sb.indexOf("答案");
                    if(index5>0) {
                        sb.insert(index5 + a, '\n');
                    }int index6= sb.indexOf(s);
                    if(index6>=0){
                    //    sb.insert(index6+0,"A.");
                    }

                    data= String.valueOf(sb);
                    CharSequence re="<mark>";
                    data=data.replaceAll("<mark>", "\u0000");
                    data=data.replaceAll("</mark>", "\u0000");
                    data=data.replaceAll("<div>", "\u0000");
                    data=data.replaceAll("</div>", "\u0000");
                    data=data.replace(' ','\0');
                System.out.println(sb);
                    JOptionPane.showMessageDialog(null, data,"答案", JOptionPane.WARNING_MESSAGE);
                }



                char i = '\0';
                /*
                for (i = 0; i < data.length(); i++) {
                    if ((data.charAt(i) == 'A' || data.charAt(i) == 'B' || data.charAt(i) == 'C' || data.charAt(i) == 'D') && data.contains(str)) {
                        for (int j = 0; j < data.length(); j++) {
                            if (data.charAt(j) == ' ' || data.charAt(j) == '<' || data.charAt(j) == '>' || data.charAt(j) == 'm' || data.charAt(j) == 'a' || data.charAt(j) == 'r' || data.charAt(j) == 'k' || data.charAt(j) == '/' || data.charAt(j) =='d' || data.charAt(j) == 'i' || data.charAt(j) =='v'){
                                data=data.replace(data.charAt(j),'\0');
                            }
                            if(data.charAt(j) == '.')
                            {
                                data=data.replace('.','\n');
                            }

                        }
                        System.out.println(data);JOptionPane.showMessageDialog(null, data,"答案", JOptionPane.WARNING_MESSAGE);
                        break;

                    }
                }*/

                // System.out.println(data);
                data = br.readLine();
            }
            // 释放资源
            br.close();
            read.close();
            input.close();
            httpUrlConn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNextLine()) {
            s = scanner.next();
            day.GetAnswer(s);
        }*/


    }
}

