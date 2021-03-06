/**
 * Copyright 2013 freiheit.com technologies gmbh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.freiheit.sqlapi4j.query.impl;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import com.freiheit.sqlapi4j.meta.SequenceDef;
import com.freiheit.sqlapi4j.query.SelectSequenceCommand;
import com.freiheit.sqlapi4j.query.statements.SelectSequenceStatement;

@ParametersAreNonnullByDefault
public class SequenceImpl implements SelectSequenceCommand {

	@Nonnull private final SequenceDef _sequence;

	public SequenceImpl(final SequenceDef sequence) {
		_sequence= sequence;
	}

	@Override
	public SelectSequenceStatement stmt() {
	    return new SequenceStatementImpl(_sequence);
	}

}
