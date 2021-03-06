/*
 * Copyright (C) 2014 ITD Systems LLC.
 *
 * This file is part of Alvex
 *
 * Alvex is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alvex is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alvex. If not, see <http://www.gnu.org/licenses/>.
 */
package com.alvexcore.share.evaluators;

import org.alfresco.error.AlfrescoRuntimeException;
import org.alfresco.web.evaluator.BaseEvaluator;
import org.json.simple.JSONObject;

public class ContentExistsEvaluator extends BaseEvaluator
{
	private static final String PARAM = "node.contentURL";
	
	@Override
	public boolean evaluate(JSONObject jsonObject)
	{
		try
		{
			Object contentValue = getJSONValue(jsonObject, PARAM);
			return (contentValue != null ? true : false );
		}
		catch (Exception e)
		{
			throw new AlfrescoRuntimeException("Can not run evaluator: " + e.getMessage());
		}
	}
}
