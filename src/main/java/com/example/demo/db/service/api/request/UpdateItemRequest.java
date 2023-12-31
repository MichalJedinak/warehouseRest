package com.example.demo.db.service.api.request;

import java.util.Objects;

public class UpdateItemRequest {
     
      private String name;
      
      private int available;
      
      private String description;

      {
            name = "defaultName";
            available = 0;
            description = "defaultDescription";
        }

      public UpdateItemRequest(String name,  int available,String description) {
            this.name = name;
            this.description = description;
            this.available = available;
      }

      public String getName() {
            return name;
      }
      public String getDescription() {
            return description;
      }
      public int getAvailable() {
            return available;
      }
      @Override
      public int hashCode() {
            return Objects.hash(name, description, available);
      }
      @Override
      public boolean equals(Object obj) {
            if (this == obj)
                  return true;
            if (!(obj instanceof UpdateItemRequest))
                  return false;
            UpdateItemRequest other = (UpdateItemRequest) obj;
            return Objects.equals(name, other.name) && Objects.equals(description, other.description)
                        && available == other.available;
      }

      public Object setAvailable(int available2) {
            return null;
      }
      
}
