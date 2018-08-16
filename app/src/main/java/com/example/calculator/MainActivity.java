package com.example.calculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView view_input;
    private StringBuilder sb = new StringBuilder(); //把所有的输入放在这个StringBuilder里面
    private int FLAG = 0;   //这个是用于二次计算的标记
    private int FLAG2 = 0;  //这个是检测括号输入的标记 输入一个左括号+1 输入一个右括号-1
                            //要注意的就是要是有删除、清空、计算结果时要改变这个的值

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {    //隐藏自带标题
            actionBar.hide();
        }

        view_input = (TextView) findViewById(R.id.view_input);
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_0 = (Button) findViewById(R.id.button_0);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_point = (Button) findViewById(R.id.button_point);
        Button button_divi = (Button) findViewById(R.id.button_divi);
        Button button_end = (Button) findViewById(R.id.button_end);
        Button button_mul = (Button) findViewById(R.id.button_mul);
        Button button_brac = (Button) findViewById(R.id.button_brac);
        Button button_brac2 = (Button) findViewById(R.id.button_brac2);
        Button button_exit = (Button) findViewById(R.id.button_exit);
        Button button_add = (Button) findViewById(R.id.button_add);
        Button button_sub = (Button) findViewById(R.id.button_sub);
        Button button_del = (Button) findViewById(R.id.button_del);
        Button button_AC = (Button) findViewById(R.id.button_AC);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_divi.setOnClickListener(this);
        button_end.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_brac.setOnClickListener(this);
        button_brac2.setOnClickListener(this);
        button_exit.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_del.setOnClickListener(this);
        button_AC.setOnClickListener(this);
        view_input.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                if (!inScope()) {   //检测输入字符串的总长度，下同
                    Toast.makeText(getBaseContext(),
                            "Out of scope", Toast.LENGTH_SHORT).show(); // 提示长度超限，下同
                    break;
                }
                if (haveBrac()) break;// 数字不能加在右括号后面，下同
                changeFlag();       //更改二次计算用的标记，下同
                if (sb.length() == 0) {
                    view_input.setText("0"); //这个是用于处理不断输入0的时候屏幕上会一直显示0的问题
                } else {
                    sb.append("0"); //如果长度不为零那么就显示0 并加在sb后面
                    view_input.setText(sb.toString());
                }
                break;
            case R.id.button_1:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("1");
                view_input.setText(sb.toString());
                break;
            case R.id.button_2:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("2");
                view_input.setText(sb.toString());
                break;
            case R.id.button_3:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("3");
                view_input.setText(sb.toString());
                break;
            case R.id.button_4:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("4");
                view_input.setText(sb.toString());
                break;
            case R.id.button_5:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("5");
                view_input.setText(sb.toString());
                break;
            case R.id.button_6:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("6");
                view_input.setText(sb.toString());
                break;
            case R.id.button_7:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("7");
                view_input.setText(sb.toString());
                break;
            case R.id.button_8:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("8");
                view_input.setText(sb.toString());
                break;
            case R.id.button_9:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (haveBrac()) break;
                changeFlag();
                sb.append("9");
                view_input.setText(sb.toString());
                break;
            case R.id.button_add:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                changeFlagByMethod();   //计算完一次后 会改变FLAG的值
                                        // 当再次输入运算符号时会改变这个标记的值
                                          // 其他运算符调用这个函数的作用相同下同
                if (sb.length() == 0)   //等于零不会显示加号
                    break;
                String s = sb.substring(sb.length() - 1, sb.length());
                if (s.equals("("))      //加号不能加在左括号后面
                    break;
                if (couldAdd(s)) {      // 还是用于能否输入这个加号的
                                        // 如果不能那就替换原本的运算符号为+
                                        //  其他运算符调用这个函数的作用相同下同
                                        // 具体实现看下面的函数
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.append("+");
                view_input.setText(sb.toString());
                break;
            case R.id.button_sub:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                changeFlagByMethod();
                s = sb.substring(sb.length() - 1, sb.length());
                if (s.equals("("))
                    break;
                if (couldAdd(s)) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.append("-");
                view_input.setText(sb.toString());
                break;
            case R.id.button_mul:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                changeFlagByMethod();
                if (sb.length() == 0)
                    break;
                s = sb.substring(sb.length() - 1, sb.length());
                if (s.equals("("))
                    break;
                if (couldAdd(s)) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.append("×");
                view_input.setText(sb.toString());
                break;
            case R.id.button_divi:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                changeFlagByMethod();
                if (sb.length() == 0)
                    break;
                s = sb.substring(sb.length() - 1, sb.length());
                if (s.equals("("))
                    break;
                if (couldAdd(s)) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.append("/");
                view_input.setText(sb.toString());
                break;
            case R.id.button_point:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (sb.length() == 0) {     //如果这个长度为0 而且还直接输入了. 那么就直接变为0.
                    sb.append("0.");
                    view_input.setText(sb.toString());
                    break;
                }

                s = sb.substring(sb.length() - 1, sb.length());
                if (s.equals("("))
                    break;
                if (s.equals(")"))
                    break;
                if (couldAdd(s)) {      //还是检测能不能添加这个 .
                    sb.delete(sb.length() - 1, sb.length());
                }
                if (havePoint())        //这个是检测如果输入了一个小数 那么就不能再输入小数点了
                    break;
                sb.append(".");
                view_input.setText(sb.toString());
                break;
            case R.id.button_brac:
                if (!inScope()) {
                    Toast.makeText(getBaseContext(), "Out of scope", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (bracAddLeft()) {    //这个也是检测能不能把左括号加在这里
                    sb.append("(");
                    view_input.setText(sb.toString());
                    FLAG2++;        //如果加了  那么就给这个标记+1  表示目前有一个左括号没有被匹配
                }
                break;
            case R.id.button_brac2:
                if (FLAG2 == 0) break;  // 如果是0 说明没有未匹配的左括号
                if (bracAddRight() && bracAddFromLeft()) {  //检测能否加这个括号
                    sb.append(")");
                    view_input.setText(sb.toString());
                    FLAG2--;        //加了以后就会减少一个未被匹配的左括号数
                }
                break;
            case R.id.button_end:
                try {//抛一个最大的异常 直接提示Error
                    dealBrac();
                    FLAG2 = 0;  //计算完后应该恢复这个检测括号的标记
                    FLAG = 1;   //这个这个是用于下次计算的标记
                    String end = InfixInToDuffix.dealEquation(InfixInToDuffix.toSuffix(sb));
                                //这个是将中缀表达式转为后缀表达式 并求值
                    if(end.length()>90){        // 如果结果超出范围 提示超出
                        Toast.makeText(getBaseContext(), "The result is out of scope", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    sb.delete(0, sb.length()); //清空字符串缓冲
                    sb.append(end); //把结果添加到字符串缓冲
                    view_input.setText(end);
                } catch (Exception e) {
                    sb.delete(0, sb.length());
                    sb.append("Error");
                    view_input.setText(sb.toString());
                    sb.delete(0, sb.length());
                }
                break;
            case R.id.button_AC:
                sb.delete(0, sb.length());
                view_input.setText(sb.toString());
                FLAG2 = 0;  //这里注意 不仅要清空字符串缓冲区
                           // 还要改变用于检测括号匹配的标记
                break;
            case R.id.button_del:
                if (sb.length() >= 1) {
                    char c = sb.charAt(sb.length() - 1);
                    if (c == ')') FLAG2++;  //这里要注意 如果遇到删除左右括号要改变标记的值
                    if (c == '(') FLAG2--;
                    sb.delete(sb.length() - 1, sb.length());
                    view_input.setText(sb.toString());
                }
                break;
            case R.id.button_exit:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Dialog");  // 弹出一个会话框 询问知否退出
                dialog.setMessage("Are you sure to exit?");
                dialog.setCancelable(true);
                dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                break;
            default:
                break;

        }
    }

    // 下面的函数在上面的调用时 已经介绍过作用
    // 不过多解释了 都是一些用于判断的函数
    private void dealBrac() {
        if (FLAG2 == 0) {
            return;
        }
        for (int i = 0; i < FLAG2; i++) {
            sb.append(")");
        }
    }

    private boolean haveBrac() {
        char[] c = sb.toString().toCharArray();
        boolean b = false;
        if (c.length == 0)
            return b;
        if (c[c.length - 1] == ')')
            b = true;
        return b;
    }

    private boolean inScope() {
        boolean b = true;
        if (sb.length() == 90)
            b = false;
        return b;
    }

    private boolean havePoint() {
        boolean b = false;
        int i;
        char[] c = sb.toString().toCharArray();
        for (i = c.length - 1; i >= 0 && (c[i] >= '0' && c[i] <= '9'); i--) {
        }
        if (i != -1) {
            if (c[i] == '.')
                b = true;
        }
        return b;
    }

    private void changeFlag() {
        if (FLAG == 1) {
            sb.delete(0, sb.length());
            FLAG = 0;
        }
    }

    private void changeFlagByMethod() {
        if (FLAG == 1) {
            FLAG = 0;
        }
    }

    private boolean couldAdd(String s) {
        boolean b = false;
        if (s.equals("+")) b = true;
        if (s.equals("-")) b = true;
        if (s.equals("×")) b = true;
        if (s.equals("/")) b = true;
        if (s.equals(".")) b = true;
        if (s.equals("(")) b = true;
        return b;
    }

    private boolean bracAddFromLeft() {
        int i = sb.length();
        boolean b = false;
        if (sb.indexOf("(") >= 0) {
            b = true;
        }
        return b;
    }

    private boolean bracAddLeft() {
        boolean b = false;
        if (sb.length() == 0) {
            b = true;
            return b;
        }
        String s = sb.substring(sb.length() - 1, sb.length());
        if (s.equals("+")) b = true;
        if (s.equals("-")) b = true;
        if (s.equals("×")) b = true;
        if (s.equals("/")) b = true;
        if (s.equals("(")) b = true;
        return b;
    }

    private boolean bracAddRight() {
        Boolean b = true;
        if (sb.length() == 0) {
            b = false;
            return b;
        }
        String s = sb.substring(sb.length() - 1, sb.length());
        if (s.equals("+")) b = false;
        if (s.equals("-")) b = false;
        if (s.equals("×")) b = false;
        if (s.equals("/")) b = false;
        if (s.equals(".")) b = false;
        if (s.equals("(")) b = false;
        return b;
    }
}
