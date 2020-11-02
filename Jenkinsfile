pipeline {
    agent any

//     triggers {
//         pollSCM '* * * * *'
//     }

    stages {
        stage('Build and Package') {
            steps {
                bash 'whoami && pwd && ls -la'
//                 mvnw clean package
            }
        }
    }
}
