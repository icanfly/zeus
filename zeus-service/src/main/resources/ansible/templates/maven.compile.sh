#!/bin/sh

COMPILE_DIR=/data/work/compile_workspace/${app_name}


#拉取SCM代码至本地编译环境
rm -rf ${COMPILE_DIR}
svn checkout ${scm_url} --revision ${revision} ${COMPILE_DIR}

cd ${COMPILE_DIR}

#编译
mvn clean package -DskipTests=true -Dmaven.test.skip=true

#执行rpm打包
rpm-build

