#!/bin/sh

#define const

#define pkg name
PKG_NAME=helloword
#define working directory
WORKING_DIR=/tmp/1232/work
SOURCE_DIR=${WORKING_DIR}/${PKG_NAME}

#prepare working directory
mkdir -p ${WORKING_DIR}

#clear source directory
rm -rf ${SOURCE_DIR}

#pull scm to compile directory
git clone  https://git.oschina.net/jfinal/jfinal.git $SOURCE_DIR

if [ $? -eq 0 ]; then
  echo "pull scm success"
  cd $SOURCE_DIR
  source /etc/profile
  echo "executing maven package command..."
  mvn clean package -DskipTests=true -Dmaven.test.skip=true

  echo "tar compiled files to .tar.gz file"
  mkdir -p ${SOURCE_DIR}/webapp/WEB-INF/target/helloworld-1.0.0
  cp -r ${SOURCE_DIR}/webapp/WEB-INF/target/*.jar ${SOURCE_DIR}/webapp/WEB-INF/target/helloworld-1.0.0/

  tar czvf helloworld-1.0.0.tar.gz -C  ${SOURCE_DIR}/webapp/WEB-INF/target helloworld-1.0.0
  cp -r -f  helloworld-1.0.0.tar.gz /home/luopeng/rpmbuild/SOURCES/
fi