package pe.com.reu.RestService;

import pe.com.reu.Model.Reniec;

import retrofit2.http.Path;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {

    //Buscar DNI en la Reniec
    @GET("api/reniecs/{NumeroDNI}")
    Call<Reniec> buscarDni(@Path("NumeroDNI") Long dni);
}
