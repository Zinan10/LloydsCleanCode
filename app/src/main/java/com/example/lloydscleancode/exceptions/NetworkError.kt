package com.example.lloydscleancode.exceptions

/**
 * Class for holding network processing error.
 */
class NetworkError(errorDetail: String) : Exception(errorDetail)