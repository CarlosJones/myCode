create table log4j
(
    logId int not null auto_increment,--流水号
    createDate varchar(45) default null,--日志生成时间
    thread varchar(45) default null,--当前线程
    level varchar(45) default null,--当前日志的级别
    class varchar(45) default null,--生成日志的类
    message varchar(245) default null,--日志具体信息
    
    primary key(logId)
)