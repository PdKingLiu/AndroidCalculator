[GitHub地址](https://github.com/PdKingLiu/AndroidCalculator)
### 先上图
![](https://img-blog.csdn.net/20180728140726978?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGVGYXJtZXJfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
![](https://img-blog.csdn.net/20180728140906494?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGVGYXJtZXJfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
![这里写图片描述](https://img-blog.csdn.net/20180728140916199?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGVGYXJtZXJfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
![这里写图片描述](https://img-blog.csdn.net/20180728140923396?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGVGYXJtZXJfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### UI 
采用百分比布局，在`app\build.gradle`的dependencies里面加上

	implementation 'com.android.support:percent:28.0.0-alpha3'
后面对应SDK版本，我的是`28.0.0-alpha3`
两个TextView用于显示我的APP名称和用户输入的计算式
其他均为按钮
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.percent.PercentRelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FAFFF0">


    <TextView
        android:id="@+id/app_name"
        android:layout_width="wrap_content"
        android:layout_height="58dp"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:gravity="center"
        android:text="CalculatorByLPD"
        android:textColor="#292421"
        android:textSize="35sp" />

    <TextView
        android:id="@+id/view_input"
        android:layout_width="match_parent"
        android:layout_height="117dp"
        android:layout_above="@+id/button_AC"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginBottom="-3dp"
        android:layout_marginLeft="0dp"
        android:layout_marginStart="0dp"
        android:layout_marginTop="98dp"
        android:gravity="left|top"
        android:text=""
        android:textColor="#292421"
        android:textSize="30sp" />


    <Button
        android:id="@+id/button_0"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_alignParentBottom="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="#BDFCC9"
        android:text="0"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_1"
        android:layout_above="@+id/button_0"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="#BDFCC9"
        android:text="1"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_2"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_0"
        android:layout_toEndOf="@+id/button_0"
        android:layout_toRightOf="@+id/button_0"
        android:background="#BDFCC9"
        android:text="2"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_3"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_0"
        android:layout_toEndOf="@+id/button_2"
        android:layout_toRightOf="@+id/button_2"
        android:background="#BDFCC9"
        android:text="3"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_4"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_1"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="#BDFCC9"
        android:text="4"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_5"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_1"
        android:layout_toEndOf="@+id/button_0"
        android:layout_toRightOf="@+id/button_0"
        android:background="#BDFCC9"
        android:text="5"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_6"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_1"
        android:layout_toEndOf="@+id/button_2"
        android:layout_toRightOf="@+id/button_2"
        android:background="#BDFCC9"
        android:text="6"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_7"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_4"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="#BDFCC9"
        android:text="7"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_8"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_4"
        android:layout_toEndOf="@+id/button_0"
        android:layout_toRightOf="@+id/button_0"
        android:background="#BDFCC9"
        android:text="8"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_9"
        android:layout_width="225dp"
        android:layout_height="121dp"
        android:layout_above="@+id/button_4"
        android:layout_toEndOf="@+id/button_2"
        android:layout_toRightOf="@+id/button_2"
        android:background="#BDFCC9"
        android:text="9"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_point"
        android:layout_alignParentBottom="true"
        android:layout_toEndOf="@+id/button_0"
        android:layout_toRightOf="@+id/button_0"
        android:background="#BDFCC9"
        android:text="."
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_divi"
        android:layout_above="@+id/button_7"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:background="#FFFFCD"
        android:text="/"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_end"
        android:layout_alignParentBottom="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:background="#FFFFCD"
        android:text="="
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_mul"
        android:layout_above="@+id/button_4"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:background="#FFFFCD"
        android:text="×"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_sub"
        android:layout_above="@+id/button_1"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:background="#FFFFCD"
        android:text="-"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_add"
        android:layout_above="@+id/button_0"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:background="#FFFFCD"
        android:text="+"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_AC"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_above="@+id/button_7"
        android:background="#FFFFCD"
        android:text="AC"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_del"
        android:layout_alignParentBottom="true"
        android:layout_toEndOf="@+id/button_2"
        android:layout_toRightOf="@+id/button_2"
        android:background="#FFFFCD"
        android:text="DEL"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_brac"
        android:layout_above="@+id/button_8"
        android:layout_toEndOf="@+id/button_0"
        android:layout_toRightOf="@+id/button_0"
        android:background="#FFFFCD"
        android:text="("
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_brac2"
        android:layout_above="@+id/button_9"
        android:layout_toEndOf="@+id/button_2"
        android:layout_toRightOf="@+id/button_2"
        android:background="#FFFFCD"
        android:text=")"
        android:textSize="40sp"
        app:layout_heightPercent="12.5%"
        app:layout_widthPercent="25%" />

    <Button
        android:id="@+id/button_exit"
        android:layout_width="34dp"
        android:layout_height="35dp"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginLeft="12dp"
        android:layout_marginStart="12dp"
        android:layout_marginTop="12dp"
        android:background="@drawable/exit" />


</android.support.percent.PercentRelativeLayout>
```
### 按钮点击事件的处理或逻辑判断
这个我先写完了基本的功能，就是保证正确的输入，然后会得到正确的结果，最后一步一步的测问题，改代码，禁止用户一些错误的输入，和处理一些能出现问题的操作。方法的调用和输入的判断我已经在代码里面注释好了，还有什么疑问还可以可以评论留言
```
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
										//效果就是计算玩一次后  若输入运算符号会直接在上次的结果上进行运算  若输入数字表示重新进行其他的运算
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
                if (sb.length() == 0)
                    break;
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
                if (couldAdd(s)) {      //还是检测能不能添加这个 小数点
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
                    dealBrac();//这个是比较重要的一个方法，作用是补全没有输上的')' 
                    //比如输入((9+1 他会根据FLAG2的值进行补输 变成((9+1))
                    FLAG2 = 0;  //计算完后应该恢复这个检测括号的标记
                    FLAG = 1;   //这个这个是用于下次计算的标记
                    String end = InfixInToDuffix.dealEquation(InfixInToDuffix.toSuffix(sb));
                                //这个是将中缀表达式转为后缀表达式 并求值
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

```
### 计算
通过上面的逻辑处理，最终得到的sb就是一个正确的中缀表达式，计算的思路就是将中缀表达式转换成后缀表达式，然后进行计算得到结果，具体算法我不过多阐述，代码是借用别人的，我附上中缀表达式和后缀表达式的介绍和转换计算的代码，新建一个类
` public static String toSuffix(StringBuilder infix)`方法是将中缀表达式转为后缀表达式
`public static String dealEquation(String equation)`方法是计算后缀表达式的值并返回
[将中缀表达式转化为后缀表达式](http://www.nowamagic.net/librarys/veda/detail/2307)
[图解后缀表达式的计算过程](http://www.nowamagic.net/librarys/veda/detail/2306)

```
package com.example.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfixInToDuffix {

    private static final Map<Character, Integer> basic = new HashMap<Character, Integer>();

    static {
        basic.put('-', 1);
        basic.put('+', 1);
        basic.put('×', 2);
        basic.put('/', 2);
        basic.put('(', 0);
    }


    public static String toSuffix(StringBuilder infix) {
        List<String> queue = new ArrayList<String>();
        List<Character> stack = new ArrayList<Character>();

        char[] charArr = infix.substring(0, infix.length()).trim().toCharArray();
        String standard = "×/+-()";
        char ch = '&';
        int len = 0;
        for (int i = 0; i < charArr.length; i++) {
            int last = 0;
            if (i > 0) {
                last = charArr[i - 1];
            }
            ch = charArr[i];
            if (Character.isDigit(ch)) {
                len++;
            } else if (ch == '.') {
                len++;
            } else if (ch == '-' && (last == '×' || last == '/' || i == 0)) {
                len++;
                continue;
            } else if (standard.indexOf(ch) != -1) {
                if (len > 0) {
                    queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len, i)));
                    len = 0;
                }
                if (ch == '(') {
                    stack.add(ch);
                    continue;
                }

                if (!stack.isEmpty()) {
                    int size = stack.size() - 1;
                    boolean flag = false;
                    while (size >= 0 && ch == ')' && stack.get(size) != '(') {
                        queue.add(String.valueOf(stack.remove(size)));
                        size--;
                        flag = true;
                    }
                    if (ch == ')' && stack.get(size) == '(') {
                        flag = true;
                    }
                    while (size >= 0 && !flag && basic.get(stack.get(size)) >= basic.get(ch)) {
                        queue.add(String.valueOf(stack.remove(size)));
                        size--;
                    }
                }
                if (ch != ')') {
                    stack.add(ch);
                } else {
                    stack.remove(stack.size() - 1);
                }
            }
            if (i == charArr.length - 1) {
                if (len > 0) {
                    queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len + 1, i + 1)));
                }
                int size = stack.size() - 1;
                while (size >= 0) {
                    queue.add(String.valueOf(stack.remove(size)));
                    size--;
                }
            }

        }
        String a = queue.toString();
        return a.substring(1, a.length() - 1);
    }


    public static String dealEquation(String equation) {

        String[] arr = equation.split(", ");
        List<String> list = new ArrayList<String>();


        for (int i = 0; i < arr.length; i++) {
            int size = list.size();
            switch (arr[i]) {
                case "+":
                    double a = Double.parseDouble(list.remove(size - 2)) + Double.parseDouble(list.remove(size - 2));
                    list.add(String.valueOf(a));
                    break;
                case "-":
                    double b = Double.parseDouble(list.remove(size - 2)) - Double.parseDouble(list.remove(size - 2));
                    list.add(String.valueOf(b));
                    break;
                case "×":
                    double c = Double.parseDouble(list.remove(size - 2)) * Double.parseDouble(list.remove(size - 2));
                    list.add(String.valueOf(c));
                    break;
                case "/":
                    double d = Double.parseDouble(list.remove(size - 2)) / Double.parseDouble(list.remove(size - 2));
                    list.add(String.valueOf(d));
                    break;
                default:
                    list.add(arr[i]);
                    break;
            }
        }

        return list.size() == 1 ? list.get(0) : "运算失败";
    }

}
```
