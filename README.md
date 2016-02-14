# Combination
关于通过各种姿势生成组合数的算法实现

主要目的是完成志哥给的任务，然后发现之前做信息学竞赛的东西竟然用到了，好开心。所以先用C++撸了几个算法，然后再改成java的。如果想看c++的实现，请移步博客：http://innerac.github.io/

## 当前实现
已经完成了：
- 实现组合数`(n,t)`。即在`[0,n)`中选出`t`个数的组合。
- 实现了通过二分查找上界或当前数的下标，用来判断是否属于一个集合里面。
- 实现了求不同集合之间的组合数。
---
- 求一个序列的全排列。-> edu.hhu.innerac.combination.util.Permutation.perms(String)
- 求一个序列的排列数（仅排列数）。-> edu.hhu.innerac.combination.util.CombinationUtil.A(int,int)
- 求一个序列的排列数（全部列出）。-> edu.hhu.innerac.combination.extend.AloPerm
- 输入一个长度为`n`的序列的列表，从中求出长度为`t`（`t<n`）的遵循原顺序的序列并且去重。 -> edu.hhu.innerac.combination.PermSelect

## 样例
例如生成如下集合中的长度为3的组合数:
```
Set A = {0,1,2}
Set B = {3,4,5,6,7}
Set C = {8,9}
```
得到结果为:
```
038
138
238
048
148
248
058
158
258
068
168
268
078
178
278
039
139
239
049
149
249
059
159
259
069
169
269
079
179
279
```
