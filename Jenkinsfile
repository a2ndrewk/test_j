pipeline {
    agent any

//     triggers {
//         pollSCM '* * * * *'
//     }

    stages {
        stage('Build and Package') {
            steps {
                sh './mvnw clean package'
//                sh 'whoami && pwd && ls -la'
//                 mvnw clean package
            }
        }
    }
}
