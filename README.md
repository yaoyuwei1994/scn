《疯狂Java讲义》学习
========
　此仓库仅用于记录本人Java的学习过程以及方便在不同设备上同步

2017/07/12:
--------
### 1.Annotation注释

### 2.输入输出

* File类访问本地文件系统

2017/07/11:
--------
### 1.JDBC

* 使用ResultSetMetaData分析结果集
* 使用RowSetFactory创建JdbcRowSet
* CachedRowSet测试(离线RowSet)
* 离线RowSet(CachedRowSet)的查询分页
* JDBC的事务支持
* 使用Java8增强的批量更新：addBatch()和executeBatch()方法
* 使用DatabaseMetaData分析数据库信息

2017/07/10:
--------
### 1.JDBC

* JDBC基础编程
* 使用Statement的executeQuery()方法执行sql查询语句
* 使用Statement的executeUpdate()方法执行DML和DDL语句
* 使用Statement的execute()方法执行任意的SQL语句
* 使用PreparedStatement执行SQL语句：性能更好，无须拼接Sql语句，防止Sql注入。
* 使用CallableStatement调用存储过程
* 创建可滚动、可更新的结果集(必须来自同一个表并包含主键)

### 2.简易图片管理程序

* 程序路径：src/lightProgram/ImageManager.java
* 通过Blob将图片保存到数据库中
* 图形化界面本地选择上传图片
* 查询数据库表中的图片并显示

2017/07/09:
--------
### 1.AWT编程

* 基本组件的综合运用
* AWT编程暂时告一段落，以后再学

### 2.Swing编程

* 由于时间原因，Swing编程以后再学

### 3.MySQL数据库与JDBC编程

* MySQL基础回顾
* 连接查询
* 子查询

2017/07/08:
--------
### 1.异常处理

* 异常跟踪栈
* 异常处理规则

### 2.AWT编程

* 基本的控件
* 各种Layout布局

2017/07/07:
--------
### 1.泛型

* 定义泛型接口、类
* 设定被限制的泛型通配符（类型通配符的上限）
* 定义泛型方法
* 定义泛型构造器
* 设定通配符上限

### 2.异常处理

* 异常类的继承体系
* Java7新增的多异常捕获
* Java7的自动关闭资源的try语句
* Checked异常和Runtime异常
* 同时使用catch和throw

2017/07/06更新：
--------
### 1.ArrayUtils类：

* 实现了ArrayUtils类的static int search(String[] array, String target)方法，该方法用于在数组中查找指定元素的索引，若没有该元素，则返回-1

### 2.梭哈小游戏：

* 实现了梭哈小游戏的基本框架，路径：src/lightProgram/ShowHand.java
* 实现了扑克牌类的封装，实现了扑克牌之间的大小比较等方法

待开发：

* 玩家跟注、弃牌等操作
* 牌面最大的玩家先下注
* 例如同花顺等牌型的大小比较，确定最后胜负

### 3.Java的各种集合学习
