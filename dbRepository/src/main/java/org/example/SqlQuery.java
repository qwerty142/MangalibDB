package org.example;

import ch.qos.logback.classic.encoder.JsonEncoder;
import org.jooq.JSON;
import org.jooq.JSONFormat;
import org.jooq.Query;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;
import org.springframework.boot.json.BasicJsonParser;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class SqlQuery {
    // jdbc:postgresql://postgresql:5432/postgres
    public static void main(String[] args) throws IOException, JSONException {
        Connection conn = null;
        Boolean needGen = Boolean.valueOf(System.getenv("GENERATE"));
        Long amount = Long.valueOf(System.getenv("QUERRYAMOUNT"));
        // long amount = 10;
        if (needGen) {
            while (conn == null) {
                try {
                    conn = DriverManager.getConnection("jdbc:postgresql://postgresql:5432/postgres", "postgres", "postgres");
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            FileWriter writer = new FileWriter(".\\sql_querries_result\\PartitionsQuerriesResult" + "2" + ".txt");

            MangaRepository mangaRepository = new MangaRepository(DSL.using(conn, SQLDialect.POSTGRES));
            for (int i = 0; i < amount; i++) {
                String querry1 = "EXPLAIN (FORMAT json, ANALYZE) SELECT u.*, m.* " +
                        "FROM mangareader u " +
                        "JOIN recommendation r ON u.user_id = r.user_id " +
                        "JOIN manga m ON r.manga_id = m.manga_id " +
                        "WHERE u.user_id BETWEEN 10500 AND 200000";
                JSONObject json = (JSONObject) new JSONTokener(mangaRepository.context.fetch(querry1).formatJSON()).nextValue();
                JSONArray nextJson = (JSONArray) json.getJSONArray("records").get(0);
                JSONObject nextJson1 = (JSONObject) nextJson.getJSONArray(0).get(0);
                Double nextJson2 = nextJson1.getJSONObject("Plan").getDouble("Total Cost");
                System.out.println(nextJson2.toString());
                writer.write(JsonParser.getData(mangaRepository.context.fetch(querry1).formatJSON()).toString());
                writer.write("\n" + "-------------------------------------------------" + "\n");
            }

            writer.write("\n" + "---------------------NEXT QUERRY ---------------------" + "\n");

            for (int i = 0; i < amount; i++) {
                String querry2 = "EXPLAIN (FORMAT json, ANALYZE) SELECT m.*, a.*, c.* " +
                        "FROM manga m " +
                        "JOIN author a ON m.author_id = a.author_id " +
                        "JOIN commentary c ON m.manga_id = c.manga_id " +
                        "ORDER BY RANDOM() " +
                        "LIMIT 10";
                writer.write(JsonParser.getData(mangaRepository.context.fetch(querry2).formatJSON()).toString());
                writer.write("\n" + "-------------------------------------------------" + "\n");
            }

            writer.write("\n" + "---------------------NEXT QUERRY ---------------------" + "\n");

            for (int i = 0; i < amount; i++) {
                String querry3 = "EXPLAIN (FORMAT json, ANALYZE) SELECT manga_id, COUNT(*) AS count " +
                        "FROM in_current_reading " +
                        "GROUP BY manga_id " +
                        "ORDER BY count DESC " +
                        "LIMIT 6";
                writer.write(JsonParser.getData(mangaRepository.context.fetch(querry3).formatJSON()).toString());
                writer.write("\n" + "-------------------------------------------------" + "\n");
            }

            writer.write("\n" + "---------------------NEXT QUERRY ---------------------" + "\n");

            for (int i = 0; i < amount; i++) {
                String querry4 = "EXPLAIN (FORMAT json, ANALYZE) SELECT c.user_id, mtt._type, mtt.tag, COUNT(*) AS amount " +
                        "FROM commentary c " +
                        "JOIN manga_type_tag mtt ON c.manga_id = mtt.manga_id " +
                        "WHERE c.user_id IN ( " +
                        "SELECT user_id " +
                        "FROM commentary " +
                        "GROUP BY user_id " +
                        "HAVING COUNT(DISTINCT manga_id) = 1 " +
                        ") " +
                        "GROUP BY c.user_id, mtt._type, mtt.tag " +
                        "HAVING COUNT(DISTINCT mtt._type) = 1 AND COUNT(DISTINCT mtt.tag) = 1";
                writer.write(JsonParser.getData(mangaRepository.context.fetch(querry4).formatJSON()).toString());
                writer.write("\n" + "-------------------------------------------------" + "\n");
            }
        }
    }
}
