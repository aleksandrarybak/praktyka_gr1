 package object;

 import java.sql.Date;

 public class Admin_seans {
        private Integer id;
        private Date start;
        private String wersja;
        private String typ;
        private Integer idsali;
        private Integer idfilm;

        public Admin_seans(Integer id, Date start, String wersja, String typ, Integer idsali, Integer idfilm){

            this.id=id;
            this.start=start;
            this.wersja=wersja;
            this.typ=typ;
            this.idsali=idsali;
            this.idfilm=idfilm;
        }

        // get i set

        public Integer getId(){ return id;}
        public void setId(Integer id2) { this.id=id2;}

        public Date getDate(){ return start;}
        public void setDate(Date dt) { this.start=dt;}

        public String getWersja(){ return wersja;}
        public void setWersja(String wer) { this.wersja=wer;}

        public String getTyp(){ return typ;}
        public void setTyp(String tp) { this.typ=tp;}

        public Integer getIdsali(){ return idsali;}
        public void setIdsali(Integer sa) { this.idsali=sa;}

        public Integer getIdfilm(){ return idfilm;}
        public void setIdfilm(Integer fil) { this.idfilm=fil;}

    }

