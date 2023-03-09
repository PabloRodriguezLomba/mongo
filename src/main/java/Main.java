import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {




    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .serverApi(ServerApi.builder()
                    .version(ServerApiVersion.V1)
                    .build())
            .build();
    MongoClient mongoClient = MongoClients.create(settings);

        MongoDatabase database = mongoClient.getDatabase("Pablorl");
        MongoCollection<Document> collection = database.getCollection("Usuario");
        MongoCollection<Document> Token = database.getCollection("Token");
        MongoCollection<Document> Entrada = database.getCollection("Entrada");
        MongoCollection<Document> Foro = database.getCollection("Foro");
        MongoCollection<Document> Coments = database.getCollection("coments");


        if (collection.countDocuments() == 0) {

            Document doc1 = new Document("_id", new ObjectId()).append("Codigo", "1").append("Nombre", "Ikit Claw").append("enable", true).append("Contraseña", "henv3askvi");
            Document doc2 = new Document("_id", new ObjectId()).append("Codigo", "2").append("Nombre", "Subre").append("enable", true).append("Contraseña", "j23bfksnn34jkx");
            Document doc3 = new Document("_id", new ObjectId()).append("Codigo", "3").append("Nombre", "Revoredo").append("enable", true).append("Contraseña", "gh342kcsdkj");
            Document doc4 = new Document("_id", new ObjectId()).append("Codigo", "4").append("Nombre", "Luka").append("enable", true).append("Contraseña", "bgfrjl453lv");
            Document doc5 = new Document("_id", new ObjectId()).append("Codigo", "5").append("Nombre", "Manbo").append("enable", true).append("Contraseña", "nj43l2fnls");
            Document doc6 = new Document("_id", new ObjectId()).append("Codigo", "6").append("Nombre", "tumbo").append("enable", true).append("Contraseña", "nklñj234ñlv");
            Document doc7 = new Document("_id", new ObjectId()).append("Codigo", "7").append("Nombre", "Ameratadora").append("enable", true).append("Contraseña", "klvfslknjk43");
            Document doc8 = new Document("_id", new ObjectId()).append("Codigo", "8").append("Nombre", "jezztails").append("enable", true).append("Contraseña", "hjklvn123ad");
            Document doc9 = new Document("_id", new ObjectId()).append("Codigo", "9").append("Nombre", "catapultas").append("enable", true).append("Contraseña", "n342lndls");
            Document doc10 = new Document("_id", new ObjectId()).append("Codigo", "10").append("Nombre", "El Loco De la Pizza").append("enable", true).append("Contraseña", "nsakl432lv");

            List<Document> users = Arrays.asList(doc1, doc2, doc3, doc4, doc5, doc6, doc7, doc8, doc9, doc10);

            InsertManyResult result = collection.insertMany(users);
        }
        if (Token.countDocuments() == 0) {
            Document doctoken1 = new Document("_id", new ObjectId()).append("token", "kbnajiobnjknbvfjavvvaklvnadfvnjf").append("CodigoUsuario", "1");
            Document doctoken2 = new Document("_id", new ObjectId()).append("token", "vbfsbsfbsfbfsdbbgscvdesavdcavaf").append("CodigoUsuario", "2");
            Document doctoken3 = new Document("_id", new ObjectId()).append("token", "ngdjbnsjknsbdlbsdfvjsdnfkbvsnlb").append("CodigoUsuario", "3");
            Document doctoken4 = new Document("_id", new ObjectId()).append("token", "jkqhovljiorjigfvdklfavnjfnhboaf").append("CodigoUsuario", "4");
            Document doctoken5 = new Document("_id", new ObjectId()).append("token", "vfnjneroieqlkfnmdalkcaklsdnvlfld").append("CodigoUsuario", "5");
            Document doctoken6 = new Document("_id", new ObjectId()).append("token", "fñqervqlokvadlkfvnvjfsblsjkfnreq").append("CodigoUsuario", "6");
            Document doctoken7 = new Document("_id", new ObjectId()).append("token", "fdsbnkklfvnkldnsbjkvnsklfbnslfvf").append("CodigoUsuario", "7");
            Document doctoken8 = new Document("_id", new ObjectId()).append("token", "qefqasdcasvavfadweqdavadqefsdvfa").append("CodigoUsuario", "8");
            Document doctoken9 = new Document("_id", new ObjectId()).append("token", "oqejutruinhjknvjksdbvfiiufrekjgf").append("CodigoUsuario", "9");
            Document doctoken10 = new Document("_id", new ObjectId()).append("token", "qoiuoerjingiofhuvjkbsndfjvbhjfd").append("CodigoUsuario", "10");


            List<Document> tokens = Arrays.asList(doctoken1, doctoken2, doctoken3, doctoken4, doctoken5, doctoken6, doctoken7, doctoken8, doctoken9, doctoken10);

            InsertManyResult result = Token.insertMany(tokens);
        }
        if (Entrada.countDocuments() == 0) {
            Document docEntrada1 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","Te Odio").append("Foro",1).append("CodigoUsuario","1");
            Document docEntrada2 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","Odio").append("Foro",2).append("CodigoUsuario","2");
            Document docEntrada3 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","Mas Odio").append("Foro",3).append("CodigoUsuario","3");
            Document docEntrada4 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","Lets go").append("Foro",4).append("CodigoUsuario","4");
            Document docEntrada5 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","Var-o-trauma").append("Foro",5).append("CodigoUsuario","5");
            Document docEntrada6 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","the deep").append("Foro",6).append("CodigoUsuario","6");
            Document docEntrada7 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","lombok").append("Foro",7).append("CodigoUsuario","7");
            Document docEntrada8 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","ron creado con raptor bane").append("Foro",8).append("CodigoUsuario","8");
            Document docEntrada9 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","crying baby vs hidrogen bomb").append("Foro",9).append("CodigoUsuario","9");
            Document docEntrada10 = new Document("Codigo",new ObjectId()).append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("NombreEntrada","roberto guillman").append("Foro",10).append("CodigoUsuario","10");

            List<Document> entrad = Arrays.asList(docEntrada1, docEntrada2, docEntrada3, docEntrada4, docEntrada5, docEntrada6, docEntrada7, docEntrada8, docEntrada9, docEntrada10);
            InsertManyResult result = Entrada.insertMany(entrad);
        }
        if (Foro.countDocuments() == 0) {
            Document docForo1 = new Document("Codigo",new ObjectId()).append("nombreForo","marvel").append("Descripcion","es marvel no mas");
            Document docForo2 = new Document("Codigo",new ObjectId()).append("nombreForo","home alone").append("Descripcion","a Child");
            Document docForo3 = new Document("Codigo",new ObjectId()).append("nombreForo","breaking bad").append("Descripcion","jessee we need to cook jesse");
            Document docForo4 = new Document("Codigo",new ObjectId()).append("nombreForo","American psiko").append("Descripcion","it was you patrick you were the american psiko");
            Document docForo5 = new Document("Codigo",new ObjectId()).append("nombreForo","aot").append("Descripcion","tatakae");
            Document docForo6 = new Document("Codigo",new ObjectId()).append("nombreForo","JoJo's").append("Descripcion","i threw away mi humanity jojo");
            Document docForo7 = new Document("Codigo",new ObjectId()).append("nombreForo","club de la lucha").append("Descripcion","una parodia mal entendida");
            Document docForo8 = new Document("Codigo",new ObjectId()).append("nombreForo","dmongo unchained").append("Descripcion","dmongo unchained");
            Document docForo9 = new Document("Codigo",new ObjectId()).append("nombreForo","detective pikachu").append("Descripcion","pikachu what the fuck");
            Document docForo10 = new Document("Codigo",new ObjectId()).append("nombreForo","el rey leon").append("Descripcion","de donde salieron los furros");

            List<Document> foro = Arrays.asList(docForo1,docForo2,docForo3,docForo4,docForo5,docForo6,docForo7,docForo8,docForo9,docForo10);
            InsertManyResult result = Foro.insertMany(foro);

        }

        if (Coments.countDocuments() == 0) {
            Document docComent1 = new Document("CodigoUsuario","1").append("CodigoEntrada","6406e994f9eb205f6f075eb4").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","lets go");
            Document docComent2 = new Document("CodigoUsuario","2").append("CodigoEntrada","6406e85d43240e015a212b3c").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","ravioli");
            Document docComent3 = new Document("CodigoUsuario","3").append("CodigoEntrada","6406e994f9eb205f6f075ead").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","supa mario wiii");
            Document docComent4 = new Document("CodigoUsuario","4").append("CodigoEntrada","6406e994f9eb205f6f075eb4").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","ligma");
            Document docComent5 = new Document("CodigoUsuario","5").append("CodigoEntrada","6406e85d43240e015a212b3c").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","l.u.k.a");
            Document docComent6 = new Document("CodigoUsuario","6").append("CodigoEntrada","6406e994f9eb205f6f075ead").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","fortnight");
            Document docComent7 = new Document("CodigoUsuario","7").append("CodigoEntrada","6406e85d43240e015a212b3c").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","malesuada");
            Document docComent8 = new Document("CodigoUsuario","8").append("CodigoEntrada","6406e994f9eb205f6f075eb4").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","goblins");
            Document docComent9 = new Document("CodigoUsuario","9").append("CodigoEntrada","6406e994f9eb205f6f075eaf").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","warchief");
            Document docComent10 = new Document("CodigoUsuario","10").append("CodigoEntrada","6406e994f9eb205f6f075eaf").append("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada").append("nombreComent","hedgeknight");

            List<Document> cuments = Arrays.asList(docComent1,docComent2,docComent3,docComent4,docComent5,docComent6,docComent7,docComent8,docComent9,docComent10);
            InsertManyResult result = Coments.insertMany(cuments);
        }


      try (MongoCursor<Document> cursor = collection.find(Filters.eq("Codigo","2")).projection(Projections.excludeId()).iterator()) {
          System.out.println();
          System.out.println("query 1");
          while (cursor.hasNext()) {
              System.out.println(cursor.next().toJson());
          }
      }

        try (MongoCursor<Document> cursor = collection.find(Filters.eq("Codigo","2")).projection(Projections.include("Nombre","Contraseña")).iterator()) {
            System.out.println();
            System.out.println("query 2");
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        }

       try (MongoCursor<Document> cursor = collection.find(Filters.eq("Contraseña","nklñj234ñlv")).projection(Projections.fields(Projections.include("Codigo"),Projections.excludeId())).iterator()) {
           System.out.println();
           System.out.println("query 3");
           while (cursor.hasNext()) {
               System.out.println(cursor.next().toJson());
           }
       }

        try (MongoCursor<Document> cursor = Entrada.find(Filters.eq("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada")).projection(Projections.excludeId()).iterator()) {
            System.out.println();
            System.out.println("query 4");
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        }

        try (MongoCursor<Document> cursor = Entrada.find(Filters.and(Filters.eq("Contenido","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer euismod, dui eu tempus volutpat, neque justo lobortis ipsum, non finibus enim ex ac massa. Mauris nec viverra ligula. Nulla metus purus, vulputate volutpat orci quis, finibus molestie dui. Sed malesuada sollicitudin est nec blandit. Nullam luctus ipsum ac rhoncus pellentesque. Vivamus efficitur tristique rutrum. Donec luctus tempus cursus. Suspendisse commodo felis fringilla efficitur malesuada"),Filters.eq("NombreEntrada","Var-o-trauma"))).projection(Projections.fields(Projections.include("NombreEntrada","Foro","CodigoUsuario"),Projections.excludeId())).iterator()) {
            System.out.println();
            System.out.println("query 5");
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        }

      try  (MongoCursor<Document> cursor = Coments.find(Filters.or(Filters.eq("CodigoUsuario","1"),Filters.eq("nombreComent","ligma"),Filters.eq("CodigoEntrada","6406e994f9eb205f6f075eaf"))).projection(Projections.fields(Projections.include("nombreComent"),Projections.excludeId())).iterator()) {
          System.out.println();
          System.out.println("query 6");
          while(cursor.hasNext()) {
              System.out.println(cursor.next().toJson());
          }
      }



      Bson query = Filters.eq("nombreComent","ligma");
      Bson updates = Updates.set("nombreComent","balls");
        UpdateResult updateResult = Coments.updateOne(query,updates);

      Bson quro = Filters.eq("Nombre","Ikit Claw");
      Bson update = Updates.set("Nombre","Claw Ikit");
      UpdateResult updateResult1 = collection.updateOne(quro,update);


      Bson query3 = Filters.eq("nombreForo","el rey leon");
      Bson updatete = Updates.set("Descripcion","look at my monkey");
      UpdateResult updateResult2 = Foro.updateOne(query3,update);

      Bson query4 = Filters.eq("")


    }
}
