-- 在db0数据库上分别创建t_order_0、t_order_1表
USE db0;
DROP TABLE IF EXISTS t_order_0;
CREATE TABLE t_order_0 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
DROP TABLE IF EXISTS t_order_1;
CREATE TABLE t_order_1 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


-- 在db1数据库上分别创建t_order_0、t_order_1表
USE db1;
DROP TABLE IF EXISTS t_order_0;
CREATE TABLE t_order_0 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS t_order_1;
CREATE TABLE t_order_1 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;