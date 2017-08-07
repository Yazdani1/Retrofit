package yazdaniscodelab.retrofityazdanifinal;

import retrofit2.http.PUT;

/**
 * Created by Yazdani on 5/25/2017.
 */

public class Constant {


    public static final class HTTP {

        public static final String BASE_URL="http://services.hanselandpetal.com";

    }

    public static final class REFERENCE{
        public static final String FLOWER=Config.PACAKAGE_NAME+ "flower";
    }

    public static final class Config{
        public static final String PACAKAGE_NAME="yazdaniscodelab.retrofityazdanifinal";
    }


}
