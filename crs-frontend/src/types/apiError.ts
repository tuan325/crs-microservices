// path: crs-frontend/src/types/apiError.ts
export interface ApiErrorResponse {
    message?: string;
    [field: string]: string | undefined;
}