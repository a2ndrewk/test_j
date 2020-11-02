pipeline {
    agent any

//     triggers {
//         pollSCM '* * * * *'
//     }

    stages {
        stage('Build and Package') {
            steps {
                sh 'whoami && pwd && ls -la'
//                 mvnw clean package
            }
        }
    }
}
