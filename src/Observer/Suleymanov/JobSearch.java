package Observer.Suleymanov;



public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperWebSite jobSite = new JavaDeveloperWebSite();

        jobSite.addVacancy("First java Position");
        jobSite.addVacancy("Second java Position");

        Observer firstSumscriber = new Subscriber("Eugene Suleimanov");
        Observer secondSumscriber = new Subscriber("Ivan Ivanov");

        jobSite.addObserver(firstSumscriber);
        jobSite.addObserver(secondSumscriber);

        jobSite.addVacancy("Third java Position");

        jobSite.removeVacancy("First java Position");

    }
}
