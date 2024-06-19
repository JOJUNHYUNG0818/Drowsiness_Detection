package com.example.myapplication;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents user information stored in Firebase.
 */
@IgnoreExtraProperties
public class FirebasePost {
    public String id;
    public String name;
    public long age;
    public String gender;
    public String timestamp;
    public FirebasePost() {
        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
    }

    public FirebasePost(String id, String name, long age, String gender,String timestamp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.timestamp = timestamp;
    }

    /**
     * Convert FirebasePost object to a map for storing in Firebase.
     * @return Map representing the FirebasePost object.
     */
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("name", name);
        result.put("age", age);
        result.put("gender", gender);
        result.put("timestamp", timestamp);
        return result;
    }
}

