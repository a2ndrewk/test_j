pipeline {
    agent any


//     triggers {
//         pollSCM '* * * * *'
//     }

    stages {
        stage('Build and Package') {
            steps {
                sh './mvnw clean package && ls -la web/target'
            }
        }

        stage('Deploy') {
            steps {
                
            }
        }
    }

}

plugins {
    id 'com.palantir.docker-run' version '<version>'
}

dockerRun {
       name 't2_cmdb_web'
       image 'openjdk:11.0.9-jdk'
       volumes '/var/jenkins_home/workspace/test_j_pipelines/web/target/web-0.0.1-SNAPSHOT.jar': '/usr/src/t2_cmdb_web.jar'
       ports '8090:8090'
       daemonize true
//        env 'MYVAR1': 'MYVALUE1', 'MYVAR2': 'MYVALUE2'
       command 'java', '-jar', '/usr/src/t2_cmdb_web.jar'
//        arguments '--hostname=custom', '-P'
       clean true
}
