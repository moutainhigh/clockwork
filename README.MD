## 安装注意事项：
- 如果要启用多租户功能，需要开通安装该系统的用户的sudo权限！
- 例如clockwork系统是用hadoop用户安装的，如果执行某个task的脚本需要hive用户才能执行，这个时候就需要从hadoop用户su到hive用户了
- 如果是Linux系统，则需要root用户修改/etc/sudoers文件，
    1. 注释掉Defaults    requiretty，即修改为 #Defaults    requiretty，表示不需要控制终端。
    2. 添加：
    hadoop  ALL=(ALL)       NOPASSWD: ALL
