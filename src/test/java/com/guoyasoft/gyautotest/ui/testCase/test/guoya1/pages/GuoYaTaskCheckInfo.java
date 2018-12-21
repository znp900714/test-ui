package com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaTaskCheckInfo extends BaseUI {

    //定位文本输入域
    @FindBy(xpath = "//textarea[@id='195_url']")
    private WebElement textarea_znp;

    //定位确定图片
    @FindBy(xpath = "//img[@id='195_img']")
    private WebElement img_znp;

    //定位保存按钮
    @FindBy(xpath = "(//input[@type='button' and @value='保存'])[14]")
    private WebElement saveBtn_znp;

    //定位刷新按钮
    @FindBy(xpath = "//input[@type='button' and @value='刷新']")
    private WebElement refreshBtn;

    //定位抽奖按钮
    @FindBy(xpath = "//input[@type='button' and @value='抽奖']")
    private WebElement luckDrawBtn;

    //操作文本域并确定和保存的方法
    public void operateTextarea(String content) {
        //向文本域中输入内容
        sendKeys(textarea_znp,content);
        sleep(1);
        //获取图片元素的src属性的属性值
        String src = img_znp.getAttribute("src");
        //对src属性值进行判断
        if(src.contains("cross.jpg")) {
            click(img_znp);
        }
        sleep(1);
        //点击保存按钮
        click(saveBtn_znp);
    }

    //点击刷新按钮
    public void clickRefreshBtn() {
        click(refreshBtn);
    }

    //点击抽奖按钮的方法
    public void clickLuckDrawBtn(WebDriver driver) {
        click(luckDrawBtn);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //切换driver到原窗口中去
    public void switchToWindow(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
}
