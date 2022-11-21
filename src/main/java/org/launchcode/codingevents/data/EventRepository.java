// Teresa Tull worked on this on 11-19-2022 ch 17 work, exercise, and studio

package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
