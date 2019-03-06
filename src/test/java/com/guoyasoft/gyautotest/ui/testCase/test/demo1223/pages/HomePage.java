package com.guoyasoft.gyautotest.ui.testCase.test.demo1223.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class HomePage extends BaseUI {

    //定位关于我链接
    @FindBy(xpath = "//li[contains(text(),'关于我')]")
    private WebElement aboutMeLink;

    //定位时间控件链接
    @FindBy(xpath = "//div[contains(text(),'时间控件')]")
    private WebElement timeControlLink;

    //定位关于年月日时分链接
    @FindBy(xpath = "//li[contains(text(),'年月日时分')]")
    private WebElement ymdhmLink;

    //定位多日期选择链接
    @FindBy(xpath = "//li[contains(text(),'多日期选择')]")
    private WebElement multiDateSelectLink;

    //定位Form链接
    @FindBy(xpath = "//div[contains(text(),'Form')]")
    private WebElement formLink;

    //定位Table链接
    @FindBy(xpath = "//div[contains(text(),'Table')]")
    private WebElement tableLink;

    //定位Dialog链接
    @FindBy(xpath = "//div[contains(text(),'Dialog')]")
    private WebElement dialogLink;

    //定位Tabs标签页链接
    @FindBy(xpath = "//div[contains(text(),'Tabs 标签页')]")
    private WebElement tabsLink;

    //定位组件链接
    @FindBy(xpath = "//div[contains(text(),'组件')]")
    private WebElement componentLink;

    @FindBy(xpath = "//li[contains(text(),'双向绑定')]")
    private WebElement doubleBinding;

    //定位上传文件链接
    @FindBy(xpath = "//div[contains(text(),'上传文件')]")
    private WebElement uploadFileLink;

    //定位播放器提示链接
    @FindBy(xpath = "//div[contains(text(),'播放器提示')]")
    private WebElement playerLink;

    //定位其他链接
    @FindBy(xpath = "//div[contains(text(),'其他')]")
    private WebElement othersLink;

    //定位iframe框
    @FindBy(xpath = "//iframe[@src='component/demoDataBindTwoWay.html']")
    private WebElement iframe;

    //点击时间控件链接的方法
    public void clickTimeControlLink() {
        click(timeControlLink);
    }

    //点击年月日时分链接的方法
    public void clickYmdhmLink() {
        click(ymdhmLink);
    }

    //点击多日期选择链接的方法
    public void clickMultiDateSelectLink() {
        click(multiDateSelectLink);
    }

    //将driver切换到iframe框中的方法
    public void switchToIframe(WebDriver driver) {
        driver.switchTo().frame(iframe);
    }
}
