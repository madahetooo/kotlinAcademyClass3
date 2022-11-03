  class AndroidDeveloper : Google() , Contract, NDA{

      override fun rangeSalary() {
          println("YOUR Range salary is 20000 EGP")
      }

      override fun workingHours() {
          println("You have to work 8 hrs per day")
      }

      override fun daysOff() {
          println("you have 21 days off per year")
      }

      override fun benefits() {
          println("you can get 2000 EGP as a bonus")
      }

      override fun noticePeriod() {
          println("You have 2 months as a Notice Period")
      }

      override fun doNotShareThisProject() {
        println("if you told anyone anything, you have to pay 2M USD")
      }
  }