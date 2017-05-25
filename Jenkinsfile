node('maven') {
  stage('Build') {
    git url: "https://github.com/abhijitrpanchal/ci_employee_project.git"
    sh "mvn package"
    stash name:"jar", includes:"target/employee-projects-0.0.1-SNAPSHOT.jar"
  }
  stage('Build Image') {
    unstash name:"jar"
    sh "oc start-build cart --from-file=target/employee-projects-0.0.1-SNAPSHOT.jar --follow"
  }
  stage('Deploy') {
    openshiftDeploy depCfg: 'ciprojectdetails'
    openshiftVerifyDeployment depCfg: 'ciprojectdetails', replicaCount: 1, verifyReplicaCount: true
  }
  stage('System Test') {
    sh "curl -s -X POST http://cart:8080/projects/1"
    sh "curl -s http://cart:8080/projects/1 | grep 'Dummy Project'"
  }
}