package com.cloudsmartz.seq.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.cloudsmartz.seq.exception.SequenceException;
import com.cloudsmartz.seq.model.SequenceId;

@Repository
public class SequenceDaoImpl implements SequenceDao {

	@Autowired
	private MongoOperations mongoOperations;

	public long getNextSequenceId(String key) throws SequenceException {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(key));
		Update update = new Update();
		update.inc("seq", 1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		 options.returnNew(true);
		SequenceId sequenceId = mongoOperations.findAndModify(query, update,
				SequenceId.class);
		if (sequenceId == null) {
			throw new SequenceException("Unable to get sequence id for key: "
					+ key);
		}
		return sequenceId.getSeq();
	}

}
