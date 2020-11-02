pipeline {
    agent any


//     triggers {
//         pollSCM '* * * * *'
//     }

    stages {
        stage('Build and Package') {
            steps {
                sh './mvnw clean package && ls -la web/target'
                sh 'docker ps -a'
            }
        }
    }
}

