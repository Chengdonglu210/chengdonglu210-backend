drop database if exists chengdonglu210mall;
drop user if exists 'chengdonglu210mall'@'%';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database chengdonglu210mall default character set utf8mb4 collate utf8mb4_unicode_ci;
use chengdonglu210mall;
create user 'chengdonglu210mall'@'%' identified by 'chengdonglu210mall123456';
grant all privileges on chengdonglu210mall.* to 'chengdonglu210mall'@'%';
flush privileges;