import java.awt.Dimension;  //封装了一个构件的高度和宽度
import java.awt.FlowLayout;  //流式布局，解决组件相互覆盖问题
import java.awt.Font;  //字体
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Objects;
import javax.swing.*;
//读取
public class Login {
    //在类中定义主函数
    //

    int num=1;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //在主函数中，实例化Login类的对象，调用初始化界面的方法

        Login login = new Login();
        login.initUI();//调用初始化界面
        JOptionPane.showMessageDialog(null,"这个项目的是为了方便个人学习Java Swing组件，以及应对过多的作业而产生的\n接入的网站为https://www.hyluz.cn/\n请不要过多使用增加网站作者的负担\n再次鸣谢雨中笔记提供的答案！");

    }
    //在类中定义初始化界面的方法
    public void initUI() {
        //在initUI中实例化JFrame类的对象
        JFrame frame = new JFrame();
        //设置窗体对象的属性值
        frame.setTitle("PTA对答案工具");//设置窗体标题
        frame.setSize(350, 400);//设置窗体大小，只对顶层容器生效
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭操作，3表示关闭窗体退出程序
        frame.setLocationRelativeTo(null);//设置窗体相对于另一组间的居中位置，参数null表示窗体相对于屏幕的中央位置
        //frame.setResizable(false);//禁止调整窗体大小
        frame.setFont(new Font("宋体",Font.PLAIN,14));//设置字体，显示格式正常，大小

        //实例化FlowLayout流式布局类的对象，指定对齐方式为居中对齐组件之间的间隔为10个像素
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,30);
        //实例化流式布局类的对象
        frame.setLayout(fl);

        //实例化JLabel标签对象，该对象显示“题目”
        JLabel labName = new JLabel("题目：");
        labName.setFont(new Font("宋体",Font.PLAIN,14));
        //将labName标签添加到窗体上
        frame.add(labName);

        //实例化JTextField标签对象化
        JTextField text_name = new JTextField();
        Dimension dim1 = new Dimension(300,30);
        text_name.setPreferredSize(dim1);//设置除顶级容器组件以外其他组件的大小
        //将textName标签添加到窗体上
        frame.add(text_name);


        //实例化JButton组件，显示为“搜索”
        JButton buttonRegister = new JButton("搜索");//一步到位
        // buttonRegister.setBounds(375, 300, 100, 30);
        buttonRegister.setFont(new Font("宋体",Font.PLAIN,14));
        frame.add(buttonRegister);

        /*实例化JLabel组件，显示提示语
        JLabel labelTips=new JLabel("这个项目的是为了方便个人学习Java Swing组件，以及应对过多的作业而产生的接入的网站为https://www.hyluz.cn/\n请不要过多使用增加网站作者的负担\n再次鸣谢雨中笔记提供的答案！");
        Dimension dimTip=new Dimension(300,30);
        labelTips.setPreferredSize(dimTip);
        labelTips.setFont(new Font("宋体",Font.PLAIN,14));
        frame.add(labelTips);*/


        //注册按钮被按下事件监视
        buttonRegister.addActionListener(new ActionListener() {
            @Override//
            public void actionPerformed(ActionEvent e) {
                if(!Objects.equals(text_name.getText(), ""))
                {
                text_name.setText(jtb.getSysClipboardText());}
                String name= text_name.getText();
                day.GetAnswer(name);

            }
        });

        frame.setVisible(true);//窗体可见，一定要放在所有组件加入窗体后


        //  button1.addActionListener(ll);
    }


}

