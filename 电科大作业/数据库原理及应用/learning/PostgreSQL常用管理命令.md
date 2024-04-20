

# 数据库管理
## 查找所有数据库
```
select datname from pg_database; 
```
## 创建数据库
```
create database 'dat_name' owner 'long_onwer' enconding UIF8;
注意：创建完数据库，需要切换到数据库下，创建和当前用户同名scheme，删除数据库后schema也会一并删除：
-- 重新登陆到新的数据库下。执行语句
creat schema AUTHORIZATTION CURRENT_USER;
```
## 

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTU3MTU2MDI3M119
-->