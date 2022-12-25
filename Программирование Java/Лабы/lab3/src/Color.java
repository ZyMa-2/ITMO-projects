public enum Color {
    BLUE{
        @Override
        public String toString(){
            return "Синяя";
        }
    },
    YELLOW{
        @Override
        public String toString(){
            return "Жёлтая";
        }
    },
    NONE{
        @Override
        public String toString(){
            return "";
        }
    }
}
