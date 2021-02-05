package fr.isen.marello.fantomassocialnetwork;

import com.google.firebase.database.PropertyName

public class userModel {
    @PropertyName("id_user") val id_user: String?,
    @PropertyName("email") val email: String?,
    @PropertyName("nom") val nom: String?,
    @PropertyName("prenom") val prenom : String?,
    @PropertyName("ddnaissance") val ddnaissance :  String?,
    @PropertyName("photo") val photo :  String?,
    @PropertyName("posts") val posts : ArrayList<String>?,
    @PropertyName("date_added") val date_added :  String?)
    {
        constructor() : this(null,null,null,null,null,null,null,null)


}
