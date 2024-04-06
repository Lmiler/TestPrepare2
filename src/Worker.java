public class Worker {
    private String name;
    private int birthYear;
    private Worker[] workersUnder;
    private Worker manager;

    boolean isManager() {
        return this.workersUnder.length > 0;
    }

    boolean isSeniorManager() {
        boolean isSenior = false;
        if (this.isManager()) {
            for (int i = 0; i < this.workersUnder.length; i++) {
                if (this.workersUnder[i].isManager()) {
                    isSenior = true;
                }
            }
        }
        return isSenior;
    }

//   boolean isMinorWorker(){
//        return !this.isManager();
//   }
    boolean isMinorWorker() {
        boolean isMinor = true;
        if (this.isManager()) {
            isMinor = false;
        }
        return isMinor;
    }

    boolean isCEO(){
        return !this.manager.isManager();
    }
}
