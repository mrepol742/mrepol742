class Update {

    public static void main(String[] sg) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd", Locale.US);
            SharedPreferences sp9 = getSharedPreferences("wv", 0);
            int current = Integer.parseInt(new Date().format(sdf));
            int stored = sp9.getInt("day", 0);
            if (current > stored || current == 1) {
                Intents.b(this, Upda.class);
                SharedPreferences.Editor spe = sp9.edit();
                spe.putInt("day", current);
                spe.apply();
            }
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }
}