package jinkom;
/*
    继承 extends
 1.提高了代码的复用性，简化了代码
 2.让类与类之间产生了继承的关系，才有了后面的多态特性的存在
 注意：千万不要为了获取其他功能简化代码，而建立继承关系，
 必须要类与类之间存在继承关系。
 用子类公共的特性创建父类
 */
//java 多层继承 在多层继承中最下层的子类拥有整个继承体系的成员，
//最上成的父类里面定义所以子类的共性描述
//java 不支持多继承，只支持单继承。因为多继承存在安全隐患
//当多个父类定义了相同的成员，之类对象不确定运行哪一个。
//java 保留这种机制，并用另一种来体现 多实现
//父类， 超类，基类
/*子父类的成员特点
 成员：1成员变量 2.函数   3.构造函数
 1.变量：子类父类 成员变量相同   对象调用先用子类 
 this.变量 首先在本类中找所需要的这个变量， 如果没有找到再父类中找。
 super 用于访问当前对象的父类成员， super.变量 直接父类中找所需变量
 
 子父类中的函数：
 当子类中出现和父类一样的函数时，当子类对象调用该函数，
 运行的是子类中的函数，如同父类中的函数被覆盖了一样，这种情况就是函数的另一种特性:重写(覆盖)
 
 注意 ：
 1.子类覆盖父类时，必须保证子类权限大于父类，才可以覆盖，否则编译出错
 访问权限修饰符：public > default > private  成员前面没加任何访问修饰符默认权限就是 default
 2.静态的函数只能覆盖静态的
 重载：只看同名的方法的参数列表
 重写：子类父类方法要一模一样
 
 有了子类父类之后的构造函数的特点：
 在对子类对象进行初始化的时候，父类构造方法也会运行，那是因为子类的构造函数默认第一行
 有一条隐式的语句 super();
 子类中的构造方法第一行都有一条隐藏的 super();语句
 构造方法不能被重写
 
 对象的转型:
 
 */
class Person{
	String name;
	int age;
}
//子类 继承父类属性    子类不能继承父类中private修饰过的成员
class Student extends Person {
	
	void study(){
		System.out.println("学习");
	}
}
class Teather extends Person {
	
	void teath(){
		System.out.println("教书");
	}
}
