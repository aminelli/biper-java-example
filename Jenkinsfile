pipeline {

    agent any

    tools {
        maven 'MVN_3_9_6' 
    }

    stages {

        stage('Compile') {
            steps {
                sh 'mvn -f pom.xml clean compile'
            }
        }


        stage('Unit Test (Junit)') {
            steps {
                sh 'mvn -f pom.xml test'
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Package (Artifact install)') {
            steps {
                sh 'mvn -f pom.xml install'
            }
        }

    }


}