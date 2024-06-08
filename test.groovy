pipeline {
    agent any

    stages {
        stage('Disk Space') {
            steps {
                script {
                    def dfOutput = sh(script: 'df -h', returnStdout: true).trim()
                    println "Доступное место на диске:"
                    println dfOutput
                }
            }
        }
    }
}
