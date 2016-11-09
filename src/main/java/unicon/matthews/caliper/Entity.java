/**
 * 
 */
package unicon.matthews.caliper;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Entity.Builder.class)
public class Entity implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotNull
  @JsonProperty("@id")
  private String id;
  
  @JsonProperty("@type")
  private String type;
  
  @JsonProperty("@context")
  private String context;

  private String name;
  private String description;
  private Map<String, String> extensions;
  private LocalDateTime dateCreated;
  private LocalDateTime dateModified;
  
  private List<String> objectType;
  private List<LearningObject> alignedLearningObjective;
  private List<String> keywords;
  private Entity isPartOf;
  private LocalDateTime datePublished;
  private String version;
  private String duration;
  private String currentTime;
  
  private Entity() {}

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getContext() {
    return context;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Map<String, String> getExtensions() {
    return extensions;
  }

  public LocalDateTime getDateCreated() {
    return dateCreated;
  }

  public LocalDateTime getDateModified() {
    return dateModified;
  }
  
  public List<String> getObjectType() {
    return objectType;
  }

  public List<LearningObject> getAlignedLearningObjective() {
    return alignedLearningObjective;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public Entity getIsPartOf() {
    return isPartOf;
  }

  public LocalDateTime getDatePublished() {
    return datePublished;
  }
  
  public String getVersion() {
    return version;
  }

  public String getDuration() {
    return duration;
  }

  public String getCurrentTime() {
    return currentTime;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((alignedLearningObjective == null) ? 0 : alignedLearningObjective.hashCode());
    result = prime * result + ((context == null) ? 0 : context.hashCode());
    result = prime * result + ((currentTime == null) ? 0 : currentTime.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((dateModified == null) ? 0 : dateModified.hashCode());
    result = prime * result + ((datePublished == null) ? 0 : datePublished.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((duration == null) ? 0 : duration.hashCode());
    result = prime * result + ((extensions == null) ? 0 : extensions.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((isPartOf == null) ? 0 : isPartOf.hashCode());
    result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((objectType == null) ? 0 : objectType.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((version == null) ? 0 : version.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Entity other = (Entity) obj;
    if (alignedLearningObjective == null) {
      if (other.alignedLearningObjective != null)
        return false;
    } else if (!alignedLearningObjective.equals(other.alignedLearningObjective))
      return false;
    if (context == null) {
      if (other.context != null)
        return false;
    } else if (!context.equals(other.context))
      return false;
    if (currentTime == null) {
      if (other.currentTime != null)
        return false;
    } else if (!currentTime.equals(other.currentTime))
      return false;
    if (dateCreated == null) {
      if (other.dateCreated != null)
        return false;
    } else if (!dateCreated.equals(other.dateCreated))
      return false;
    if (dateModified == null) {
      if (other.dateModified != null)
        return false;
    } else if (!dateModified.equals(other.dateModified))
      return false;
    if (datePublished == null) {
      if (other.datePublished != null)
        return false;
    } else if (!datePublished.equals(other.datePublished))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (duration == null) {
      if (other.duration != null)
        return false;
    } else if (!duration.equals(other.duration))
      return false;
    if (extensions == null) {
      if (other.extensions != null)
        return false;
    } else if (!extensions.equals(other.extensions))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (isPartOf == null) {
      if (other.isPartOf != null)
        return false;
    } else if (!isPartOf.equals(other.isPartOf))
      return false;
    if (keywords == null) {
      if (other.keywords != null)
        return false;
    } else if (!keywords.equals(other.keywords))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (objectType == null) {
      if (other.objectType != null)
        return false;
    } else if (!objectType.equals(other.objectType))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    if (version == null) {
      if (other.version != null)
        return false;
    } else if (!version.equals(other.version))
      return false;
    return true;
  }

  public static class Builder {
    Entity _entity = new Entity();
    
    @JsonProperty("@id")
    public Builder withId(String id) {
      _entity.id = id;
      return this;
    }
    
    @JsonProperty("@type")
    public Builder withType(String type) {
      _entity.type = type;
      return this;
    }
    
    @JsonProperty("@context")
    public Builder withContext(String context) {
      _entity.context = context;
      return this;
    }
    
    public Builder withName(String name) {
      _entity.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _entity.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _entity.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(LocalDateTime dateCreated) {
      _entity.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(LocalDateTime dataModified) {
      _entity.dateModified = dataModified;
      return this;
    }
    
    public Builder withObjectType(List<String> objectType) {
      _entity.objectType = objectType;
      return this;
    }
    
    public Builder withAlignedLearningObjective(List<LearningObject> alignedLearningObjective) {
      _entity.alignedLearningObjective = alignedLearningObjective;
      return this;
    }
    
    public Builder withKeywords(List<String> keywords) {
      _entity.keywords = keywords;
      return this;
    }
    
    public Builder withIsPartOf(Entity isPartOf) {
      _entity.isPartOf = isPartOf;
      return this;
    }
    
    public Builder withDatePublished(LocalDateTime datePublished) {
      _entity.datePublished = datePublished;
      return this;
    }
    
    public Builder withVersion(String version) {
      _entity.version = version;
      return this;
    }
    
    public Builder withDuration(String duration) {
      _entity.duration = duration;
      return this;
    }
    
    public Builder withCurrentTime(String currentTime) {
      _entity.currentTime = currentTime;
      return this;
    }

    public Entity build() {
      if (StringUtils.isBlank(_entity.id) 
          || StringUtils.isBlank(_entity.type)) {
        throw new IllegalStateException(_entity.toString());
      }

      return _entity;
    }
  }
}
