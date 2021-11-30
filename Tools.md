# 1. Arrays

具有以下功能：

给数组赋值：通过 fill 方法。
对数组排序：通过 sort 方法,按升序。
比较数组： 通过 equals 方法比较数组中元素值是否相等。

### 1.char数组排序
```
char[] ch;
Arrays.sort(ch);  //void
```
### 2.string和char[]的区别与转换

A.两种方法将char[]转为string：
```
(1) new String(char[]);
(2) String.valueOf(char[]);
```

B.string转为char[]

```
char[] ch = str.toCharArray();
```
# 2. String
```
1	char charAt(int index) 返回指定索引处的 char 值。
2	int compareTo(Object o) 把这个字符串和另一个对象比较。
3	int compareTo(String anotherString) 按字典顺序比较两个字符串。
4	int compareToIgnoreCase(String str) 按字典顺序比较两个字符串，不考虑大小写。
```
# 3. Map

map遍历：
```
map.forEach((k,v)-> System.out.println(v));
```

# 4. 栈、队列
```
Stack<Integer> stack = new Stack();
```