pipeline {
    agent {
	 	label 'gitops'
	 }
    stages {
    //Execution with First Container   
      stage('Functional Testing') {

            steps{
                sh 'mvn  test'
                    //slackSend  color: "green", message: "Surefire Test Reports"
                    //slackUploadFile filePath: "target/surefire-reports/emailable-report.html", initialComment:  "Test Reports"
                    //slackUploadFile channel: "#iscp-kube", filePath: "target/surefire-reports/emailable-report.html"
            }

        }
    }
        
}
