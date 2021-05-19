class Scratch {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setDataLoadFinishedListener(new MyClass.DataLoadFinishedListener() {
            @Override
            public void onDataLoadFinishedListener(int data_type) {
                System.out.println(data_type);
            }
        });
        myClass.someOtherMethodOfMyClass();
    }


    public static class MyClass {
        public interface DataLoadFinishedListener {
            public void onDataLoadFinishedListener(int data_type);
        }

        private DataLoadFinishedListener m_lDataLoadFinished;

        public void setDataLoadFinishedListener(DataLoadFinishedListener dlf) {
            this.m_lDataLoadFinished = dlf;
        }


        private void someOtherMethodOfMyClass() {
            m_lDataLoadFinished.onDataLoadFinishedListener(1);
        }
    }
}